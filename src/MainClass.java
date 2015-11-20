
public class MainClass {
	public static void main(String args[]){
		
		File_Handler fh=new File_Handler("C:\\Users\\Prasanna\\Desktop\\cams_net_data.txt","camera_node_6");
		fh.setDb_connection_string("jdbc:mysql://localhost:3306/");       //the database name is "camera"
		fh.file_action();
		
		/*File_Handler fh1=new File_Handler(""<give the next file of other camera node>"",""give the next table name"");
		fh.setDb_connection_string("jdbc:mysql://localhost:3306/");       //the database name is "camera"
		fh.file_action();*/
		
		/*File_Handler fh1=new File_Handler(""<give the next file of other camera node>"",""give the next table name"");
		fh.setDb_connection_string("jdbc:mysql://localhost:3306/");       //the database name is "camera"
		fh.file_action();*/
		
		/*File_Handler fh1=new File_Handler(""<give the next file of other camera node>"",""give the next table name"");
		fh.setDb_connection_string("jdbc:mysql://localhost:3306/");       //the database name is "camera"
		fh.file_action();*/
		
		//do for all 8 camera nodes
		}
			
	}
	

