package kot;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Kot {

	private String imie;
	private String opiekun;
	private Date dataUr;
	private Double masa;

	Kot(String imie, String opiekun, Date dataUr, Double masa){
		this.imie=imie;
		this.opiekun=opiekun;
		this.dataUr=dataUr;
		this.masa=masa;
		DateFormat dF = new SimpleDateFormat("dd-MM-yyyy");
		DateFormat dT = new SimpleDateFormat("HH:mm:ss");
		
		System.out.println("Konstruktor utworzy³ kota o imieniu: "+getImie()+"\nktórego opiekunem jest "+opiekun
				+"\nKot urodzi³ siê "+dF.format(dataUr)+"r. o godzinie "+dT.format(dataUr)
				+"\nMasa urodzeniowa wynosi "+masa+" kg");
	}
	
	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getOpiekun() {
		return opiekun;
	}

	public void setOpiekun(String opiekun) {
		this.opiekun = opiekun;
	}

	public Date getDataUr() {
		return dataUr;
	}

	public void setDataUr(Date dataUr) {
		this.dataUr = dataUr;
	}

	public Double getMasa() {
		return masa;
	}

	public void setMasa(Double masa) {
		this.masa = masa;
	}

	
	public static Scanner sc = new Scanner(System.in);
	public static String odczyt(){
		return(sc.nextLine());
	}
	
	public static void DodKot(String imie, String opiekun, Date dataUr, Double masa){
		new Kot(imie, opiekun, dataUr, masa);
	}
	
	public static void proceduraDodaniaKota() {
		System.out.println("Podaj imiê kota: ");
		String imie = odczyt();
		System.out.println("Podaj imiê w³aœciciela: ");
		String opiekun = odczyt();
		System.out.println("Podaj datê urodzenia kota: ");
//		Date dataUr= odczyt();
		Date data = new Date();
		Double masa = 0.001;
		DodKot(imie, opiekun, data, masa);
	}
	
	public static void main(String[] args) {

		proceduraDodaniaKota();

		
		
		
	}

}
