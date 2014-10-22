import gerat.Gerat;
import gerat.PosthofProject;
import thymio.ThymioClient;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ThymioClient client = new ThymioClient();
		Gerat gerat = new Gerat(client);
		PosthofProject project = new PosthofProject(gerat, client);
		project.start();
	}

}
