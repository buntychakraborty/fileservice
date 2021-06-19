package fileservice;

public class FileRunner {

	public static void main(String[] args) {
		FileService.read("File1.txt").subscribe(data->System.out.println("Data :"+data),error->System.out.println("Error :"+error.getMessage()),()->System.out.println("Task Done"));
		FileService.write("File2.txt","This is the added one").subscribe(data->System.out.println("Data :"+data),error->System.out.println("Error :"+error.getMessage()),()->System.out.println("Task Done"));
		FileService.delete("File3.txt").subscribe(data->System.out.println("Data :"+data),error->System.out.println("Error :"+error.getMessage()),()->System.out.println("Task Done"));

	}

}
