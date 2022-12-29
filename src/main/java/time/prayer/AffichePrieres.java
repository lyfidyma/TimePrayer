package time.prayer;

public class AffichePrieres extends Horaire{
	public AffichePrieres() throws Exception {
		System.out.println("Fajr   : "+getFajrhour());
		System.out.println("Soubh  : "+getSoubhhour());
		System.out.println("Dhouhr : "+getDhouhrhour());
		System.out.println("Asr    : "+getAsrhour());
		System.out.println("Maghrib: "+getMaghribhour());
		System.out.println("Icha   : "+getIchahour());
	}

}
