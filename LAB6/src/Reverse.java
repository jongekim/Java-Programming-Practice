import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Reverse {
	
	
	 public static void main(String[] args){
		 ArrayList<String> tmp = new ArrayList<String>();
		 int num = 0;
		 
	 try {
		 InputStream fis = new FileInputStream("input.txt");
		 InputStreamReader isr = new InputStreamReader(fis);
		 BufferedReader br = new BufferedReader(isr);
		 
		 String data = "start";
		 while((data = br.readLine()) != null) {
		 
		 //System.out.println("data:"+data);
		 tmp.add(data);
		 num++;
		 }
	 }
	 catch ( IOException e ) {
			System.out.println(e);
		}finally{
			//try { rw.close(); } catch ( IOException e ) {}
			//try { br.close(); } catch ( IOException e ) {}
		}
	 /*System.out.println(num);
	 while(num!=0)
	 {
		 System.out.println(tmp.get(num-1));
		 num--;
	 }
	 
	 System.out.println("END");
	 
	 */
	 try{
         //파일 객체 생성
         File file = new File("output.txt");
         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
         
         if(file.isFile() && file.canWrite()){
        	 
        	 while(num!=0) {
             //쓰기
             bufferedWriter.write(tmp.get(num-1));
             //개행문자쓰기
             bufferedWriter.newLine();
             num--;
             
        	 }
        	 bufferedWriter.close();
         }
     }catch (IOException e) {
         System.out.println(e);
     }

	 }
}

