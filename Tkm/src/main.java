import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	 Scanner scanner =new Scanner(System.in);
	 Random random =new Random();
	 String[] tkm = {"Taþ","Kaðýt","Makas"};
	 
	 	int iso_puan=0;
	 	int bilg_puan=0;
	 	
	 	System.out.println("TAÞ KAÐIT MAKAS OYNUNA HOÞGELDÝNÝZ!");
	 	
	 	while(true) {
	 		System.out.println("-------------");
	 		System.out.println("Taþ Mý? \nKaðýt Mý? \nMakas Mý?");
	 		
	 		String isoDeger=scanner.nextLine();
	 		int bilgDeger = random.nextInt(tkm.length);
	 		
	 		if(tkm[bilgDeger].equals("Taþ") && isoDeger.equals("Taþ")) {
	 			System.out.println("Durum Berabere ");
	 			System.out.println("Puanýnýz : "+iso_puan+"\nBilgisayarýn Puaný : "+bilg_puan);
	 		}
	 		else if(tkm[bilgDeger].equals("Taþ") && isoDeger.equals("Kaðýt")) {
	 			System.out.println("Kaðýt Taþý Sarar! \nKazandýnýz");
	 			iso_puan++;
	 			System.out.println("Puanýnýz : "+iso_puan+"\nBilgisayarýn Puaný : "+bilg_puan);
	 			
	 		}else if(tkm[bilgDeger].equals("Taþ") && isoDeger.equals("Makas")) {
	 			System.out.println("Taþ Makasý Kýrar! \nKaybettiniz");
	 			bilg_puan++;
	 			System.out.println("Puanýnýz : "+iso_puan+"\nBilgisayarýn Puaný : "+bilg_puan);
	 			
	 		}else if(tkm[bilgDeger].equals("Kaðýt") && isoDeger.equals("Kaðýt")) {
	 			System.out.println("Durum Berabere ");
	 			System.out.println("Puanýnýz : "+iso_puan+"\nBilgisayarýn Puaný : "+bilg_puan);
	 			
	 		}else if(tkm[bilgDeger].equals("Kaðýt") && isoDeger.equals("Taþ")) {
	 			System.out.println("Kaðýt Taþý Sarar! \nKaybettiniz");
	 			bilg_puan++;
	 			System.out.println("Puanýnýz : "+iso_puan+"\nBilgisayarýn Puaný : "+bilg_puan);
	 			
	 		}else if(tkm[bilgDeger].equals("Kaðýt") && isoDeger.equals("Makas")) {
	 			System.out.println("Makas Kaðýdý Keser! \nKazandýnýz");
	 			iso_puan++;
	 			System.out.println("Puanýnýz : "+iso_puan+"\nBilgisayarýn Puaný : "+bilg_puan);
	 			
	 		}else if(tkm[bilgDeger].equals("Makas") && isoDeger.equals("Makas")) {
	 			System.out.println("Durum Berabere ");
	 			System.out.println("Puanýnýz : "+iso_puan+"\nBilgisayarýn Puaný : "+bilg_puan);
	 			
	 		}else if(tkm[bilgDeger].equals("Makas") && isoDeger.equals("Taþ")) {
	 			System.out.println("Taþ Makasý Kýrar! \nKazandýnýz");
	 			iso_puan++;
	 			System.out.println("Puanýnýz : "+iso_puan+"\nBilgisayarýn Puaný : "+bilg_puan);
	 			
	 		}else if(tkm[bilgDeger].equals("Makas") && isoDeger.equals("Kaðýt")) {
	 			System.out.println("Makas Kaðýdý Keser! \nKaybettiniz");
	 			bilg_puan++;
	 			System.out.println("Puanýnýz : "+iso_puan+"\nBilgisayarýn Puaný : "+bilg_puan);
	 			
	 		}else {
	 			System.out.println("Hattalý Bir Giriþ Yaptýnýz");
	 			continue;
	 		}
	 		if(iso_puan==3) {
	 			System.out.println("-----------");
	 			System.out.println("Oyunu "+iso_puan+"-"+bilg_puan+" Kazandýnýz");
	 			break;
	 		}else if(bilg_puan==3) {
	 			System.out.println("-----------");
	 			System.out.println("Oyunu "+bilg_puan+"-"+iso_puan+" Kaybettiniz");
	 			break;
	 		}
	 		
	 		
	 	}

	}

}
