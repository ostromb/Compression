package upg6;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Upg6 {
	
	public static String detector(String[] clist) {
		int counter = 1;
		int middlehand = 0;
		int value = 1;
		int stop = 0;
		String out = "";
		for(int i=0;i<clist.length;i++) {

			if(clist[i].compareTo("a")==0 || clist[i].compareTo("b")==0) {

				for(int l=0;l<value;l++) {
					out=out+clist[i];
				}
				 value = 1;
			}

			else if(clist[i].compareTo("(")==0){

				List<String> recursList = new ArrayList<String>();
				int tik = i;
				while(counter>0) {
				tik++;
					
					
					if (clist[tik].compareTo("(")==0) {
						counter++;
					
				
					}
					else if(clist[tik].compareTo(")")==0){
						stop = tik;
						counter--;
				
	
					}
			

			}

			     for(i=i+1;i<stop;i++) {
			    	 
                     recursList.add(clist[i]);
                 }

                     String[] recursiveArray = recursList.toArray(new String[0]);

                     for(int l=0;l<value;l++) {

                         out = out+detector(recursiveArray);
                     
                     
                 }
                     i = stop;
                     counter = 1;
                     value =1;

			}
			
			else {

				String valuestr = "";
				for(int k=i;k<clist.length;k++) {
					
					if(clist[k].compareTo("a")==0) {
						k=clist.length;
					}
					else if(clist[k].compareTo("b")==0){
						k=clist.length;
					}
					else if(clist[k].compareTo("(")==0){
						k=clist.length;
					}
					else {
						valuestr = valuestr+clist[k];
						 middlehand = k;
					}
					
			}
				i = middlehand;
				value = Integer.parseInt(valuestr);
				

			
			}
		}
		return out;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		String compressed = obj.nextLine();
		String[] clist = new String[compressed.length()];
		for(int i = 0;i<compressed.length();i++) {
			clist[i] = String.valueOf(compressed.charAt(i));
		}
		
		String ans = detector(clist);
		System.out.println(ans);
		
			
		
		
		}
		
		


	
		

	}




