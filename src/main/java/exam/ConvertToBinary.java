package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    int bin[] = new int [40];
  	int ind = 0 ;

  	try{
  		while(n >= 0){
  			bin[ind++]==num%2;
  			num = num/2;
  		}
  	}
  	catch(Exception e){
  		System.out.println("so far it doesn't still supports to convert the negative number into binary"+ e.getMessage());

  	}
    return "";
  }
}
