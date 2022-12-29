package time.prayer;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.chrono.HijrahDate;
import java.util.Date;

public class Timeclass {
	private String grDate;
	private String stringHijDate;
	HijrahDate hijradate;

	public Timeclass(){
		//Gregorian Date
		final SimpleDateFormat formater=new SimpleDateFormat("d MMMM yyyy");
		this.grDate = formater.format(new Date());
		//Hijri Date
		hijradate = HijrahDate.from(LocalDate.now());
		//Hijri date to string
		stringHijDate = hijradate.toString();
	}

	public String getHijradate() {
		return stringHijDate;
	}

	public void setHijradate(HijrahDate hijradate) {
		this.hijradate = hijradate;
	}

	public String getGrDate() {
		return grDate;
	}

	public void setGrdate(String grDate) {
		this.grDate = grDate;
	}
}
