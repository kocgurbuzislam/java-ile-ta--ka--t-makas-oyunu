import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	 Scanner scanner =new Scanner(System.in);
	 Random random =new Random();
	 String[] tkm = {"Ta�","Ka��t","Makas"};
	 
	 	int iso_puan=0;
	 	int bilg_puan=0;
	 	
	 	System.out.println("TA� KA�IT MAKAS OYNUNA HO�GELD�N�Z!");
	 	
	 	while(true) {
	 		System.out.println("-------------");
	 		System.out.println("Ta� M�? \nKa��t M�? \nMakas M�?");
	 		
	 		String isoDeger=scanner.nextLine();
	 		int bilgDeger = random.nextInt(tkm.length);
	 		
	 		if(tkm[bilgDeger].equals("Ta�") && isoDeger.equals("Ta�")) {
	 			System.out.println("Durum Berabere ");
	 			System.out.println("Puan�n�z : "+iso_puan+"\nBilgisayar�n Puan� : "+bilg_puan);
	 		}
	 		else if(tkm[bilgDeger].equals("Ta�") && isoDeger.equals("Ka��t")) {
	 			System.out.println("Ka��t Ta�� Sarar! \nKazand�n�z");
	 			iso_puan++;
	 			System.out.println("Puan�n�z : "+iso_puan+"\nBilgisayar�n Puan� : "+bilg_puan);
	 			
	 		}else if(tkm[bilgDeger].equals("Ta�") && isoDeger.equals("Makas")) {
	 			System.out.println("Ta� Makas� K�rar! \nKaybettiniz");
	 			bilg_puan++;
	 			System.out.println("Puan�n�z : "+iso_puan+"\nBilgisayar�n Puan� : "+bilg_puan);
	 			
	 		}else if(tkm[bilgDeger].equals("Ka��t") && isoDeger.equals("Ka��t")) {
	 			System.out.println("Durum Berabere ");
	 			System.out.println("Puan�n�z : "+iso_puan+"\nBilgisayar�n Puan� : "+bilg_puan);
	 			
	 		}else if(tkm[bilgDeger].equals("Ka��t") && isoDeger.equals("Ta�")) {
	 			System.out.println("Ka��t Ta�� Sarar! \nKaybettiniz");
	 			bilg_puan++;
	 			System.out.println("Puan�n�z : "+iso_puan+"\nBilgisayar�n Puan� : "+bilg_puan);
	 			
	 		}else if(tkm[bilgDeger].equals("Ka��t") && isoDeger.equals("Makas")) {
	 			System.out.println("Makas Ka��d� Keser! \nKazand�n�z");
	 			iso_puan++;
	 			System.out.println("Puan�n�z : "+iso_puan+"\nBilgisayar�n Puan� : "+bilg_puan);
	 			
	 		}else if(tkm[bilgDeger].equals("Makas") && isoDeger.equals("Makas")) {
	 			System.out.println("Durum Berabere ");
	 			System.out.println("Puan�n�z : "+iso_puan+"\nBilgisayar�n Puan� : "+bilg_puan);
	 			
	 		}else if(tkm[bilgDeger].equals("Makas") && isoDeger.equals("Ta�")) {
	 			System.out.println("Ta� Makas� K�rar! \nKazand�n�z");
	 			iso_puan++;
	 			System.out.println("Puan�n�z : "+iso_puan+"\nBilgisayar�n Puan� : "+bilg_puan);
	 			
	 		}else if(tkm[bilgDeger].equals("Makas") && isoDeger.equals("Ka��t")) {
	 			System.out.println("Makas Ka��d� Keser! \nKaybettiniz");
	 			bilg_puan++;
	 			System.out.println("Puan�n�z : "+iso_puan+"\nBilgisayar�n Puan� : "+bilg_puan);
	 			
	 		}else {
	 			System.out.println("Hattal� Bir Giri� Yapt�n�z");
	 			continue;
	 		}
	 		if(iso_puan==3) {
	 			System.out.println("-----------");
	 			System.out.println("Oyunu "+iso_puan+"-"+bilg_puan+" Kazand�n�z");
	 			break;
	 		}else if(bilg_puan==3) {
	 			System.out.println("-----------");
	 			System.out.println("Oyunu "+bilg_puan+"-"+iso_puan+" Kaybettiniz");
	 			break;
	 		}
	 		
	 		
	 	}

	}

}
