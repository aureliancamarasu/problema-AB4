import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class loc {

	String nume ;
	oras oras; 
	int pret;
	Date date_plecare;
	Date data_final; 
	ArrayList<String> activitati = new ArrayList();

	
	loc() {
		
	}
	
	loc(String nume , oras oras ,int pret , Date data_plecare , Date data_final) {
		
		this.nume =nume;
		this.oras=oras;
		this.pret=pret;
		this.date_plecare=data_plecare;
		this.data_final=data_final;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public oras getOras() {
		return oras;
	}

	public void setOras(oras oras) {
		this.oras = oras;
	}

	public int getPret() {
		return pret;
	}

	public void setPret(int pret) {
		this.pret = pret;
	}

	public Date getDate_plecare() {
		return date_plecare;
	}

	public void setDate_plecare(Date date_plecare) {
		this.date_plecare = date_plecare;
	}

	public Date getData_final() {
		return data_final;
	}

	public void setData_final(Date data_final) {
		this.data_final = data_final;
	}

	
		
		
		public void citeste(String fisier) throws ParseException, IOException
		{
			long start = System.currentTimeMillis();
			File file = new File(fisier);
          
			try {

			Scanner scanner = new Scanner(file);
			BufferedReader r = new BufferedReader(new FileReader(file));
			while (scanner.hasNextLine()) {
			this.nume= scanner.next();
			
			this.oras = new oras(scanner.next() , scanner.next() , scanner.next());
		
			this.pret=scanner.nextInt();
			;
			String target1 = scanner.next();
			DateFormat df1 = new SimpleDateFormat("YYYY/MM/dd");
			this.date_plecare =  df1.parse(target1); 
			
			String target = scanner.next();
			DateFormat df = new SimpleDateFormat("YYYY/MM/dd");
			this.data_final =  df.parse(target);
			
			   boolean line;
			while((line = scanner.hasNext())) {
			  
			   
				activitati.add(scanner.next());
			
			}
			}
			scanner.close();
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			}

			}

		void afisare() {
			System.out.println("Nume "+this.nume);
			oras.afisare();
			System.out.println("Pret: "+this.pret);
			System.out.println("Data1 "+this.date_plecare);
			System.out.println("Data2 "+this.data_final);
			for(int i=0; i<activitati.size();i++){
				System.out.println(activitati.get(i));
		}
			
			
		}


	}

	

