package time.prayer;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.Normalizer;
import java.util.Properties;

public class Horaire {
	protected int jour;
	protected int annee;
	protected String mois;
	protected String fajrhour;
	protected String soubhhour;
	protected String dhouhrhour;
	protected String asrhour;
	protected String maghribhour;
	protected String ichahour;

	public Horaire() throws Exception{
		Timeclass today = new Timeclass();
		String datetoday = today.getGrDate();

		//		Utilisation de la classe Collator pour comparer les mois avec accent
		//		Collator collator = Collator.getInstance();
		//		collator.setStrength(Collator.PRIMARY);

		Properties props = new Properties();
		//Read conf.properties file using tryWithRessources statement
		try(FileInputStream fis = new FileInputStream("conf.properties")){
			props.load(fis);
		} 
		//}

		// Loading the Driver
		Class.forName(props.getProperty("jdbc.driver.class"));
		String url = props.getProperty("jdbc.url");
		String login = props.getProperty("jdbc.login");
		String password = props.getProperty("jdbc.password");

		//Ordre SQL préparé
		String strSql = "Select jour, mois, annee, fajr, suba, "
				+ "tisbar, takussan,timis, guewe from horaire where concat(jour, mois, annee)=?";
		// Getting Database Connection Object by Passing URL, Username and Password
		//Using tryWithRessources Statement
		try(Connection connection = DriverManager.getConnection(url, login, password);
				PreparedStatement statement = connection.prepareStatement(strSql)){

			statement.setString(1, Normalizer
					.normalize(datetoday, Normalizer.Form.NFD)
					.replaceAll("[^\\p{ASCII}]+|\\s", ""));

			ResultSet rs = statement.executeQuery();

			// Starting from First Row for Iteration
			rs.beforeFirst();

			while (rs.next()) {
				//
				//				if(collator.compare(datetoday,(rs.getString("jour")+' '+rs.getString("mois")
				//				+' '+rs.getString("annee"))) == 0) {
				//
				//					jour=rs.getInt("jour");
				//					mois=rs.getString("mois");
				//					annee = rs.getInt("annee");
				fajrhour = rs.getString("fajr").substring(0, 5);
				soubhhour = rs.getString("suba").substring(0, 5);
				dhouhrhour = rs.getString("tisbar").substring(0, 5);
				asrhour = rs.getString("takussan").substring(0, 5);
				maghribhour = rs.getString("timis").substring(0, 5);
				ichahour = rs.getString("guewe").substring(0, 5);
			}
		}
	}


	public String getFajrhour() {
		return fajrhour;
	}

	public String getSoubhhour() {
		return soubhhour;
	}

	public String getDhouhrhour() {
		return dhouhrhour;
	}

	public String getAsrhour() {
		return asrhour;
	}

	public String getMaghribhour() {
		return maghribhour;
	}

	public String getIchahour() {
		return ichahour;
	}

}
