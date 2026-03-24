import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Desktop;

public class kingk {
    public static void main(String[] args) {
        // 1. KODI YA PEJI KUU (INDEX)
        String mainHtml = "<!DOCTYPE html>\n" +
                "<html lang='sw'>\n" +
                "<head>\n" +
                "    <meta charset='UTF-8'>\n" +
                "    <title>King Kipamoja Tech</title>\n" +
                "    <style>\n" +
                "        body { font-family: 'Poppins', sans-serif; margin: 0; background-color: #f4f7f6; color: #333; scroll-behavior: smooth; }\n" +
                "        nav { background: #2c3e50; color: white; padding: 15px 50px; display: flex; justify-content: space-between; align-items: center; position: sticky; top: 0; z-index: 1000; }\n" +
                "        nav a { color: white; text-decoration: none; margin-left: 20px; font-weight: bold; }\n" +
                "        .hero { background: linear-gradient(rgba(0,0,0,0.7), rgba(0,0,0,0.7)), url('https://images.unsplash.com/photo-1517694712202-14dd9538aa97?auto=format&fit=crop&w=1350&q=80'); \n" +
                "                height: 400px; background-size: cover; background-position: center; color: white; \n" +
                "                display: flex; flex-direction: column; justify-content: center; align-items: center; text-align: center; }\n" +
                "        .container { padding: 50px; max-width: 1100px; margin: auto; text-align: center; }\n" +
                "        .services { display: flex; justify-content: space-around; gap: 20px; margin-top: 30px; }\n" +
                "        .card { background: white; padding: 25px; border-radius: 10px; box-shadow: 0 4px 15px rgba(0,0,0,0.1); flex: 1; text-align: center; }\n" +
                "        .btn-small { background: #e74c3c; color: white; padding: 10px 20px; border-radius: 5px; text-decoration: none; display: inline-block; margin-top: 15px; font-weight: bold; }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <nav><div style='font-size: 24px;'>👑 KING<b>KIPAMOJA</b></div></nav>\n" +
                "    <div class='hero'><h1>WELCOME TO KING KIPAMOJA</h1></div>\n" +
                "    <div class='container'>\n" +
                "        <h2>Huduma Tunazotoa</h2>\n" +
                "        <div class='services'>\n" +
                "            <div class='card'><h3>Website Creator</h3><p>Picha ya Ronaldo</p><a href='website.html' class='btn-small'>Fungua</a></div>\n" +
                "            <div class='card'><h3>App Development</h3><p>Picha ya Messi</p><a href='apps.html' class='btn-small'>Fungua</a></div>\n" +
                "            <div class='card'><h3>Game Design</h3><p>Picha ya Mbappe</p><a href='games.html' class='btn-small'>Fungua</a></div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";

        // 2. KODI ZA PEJI ZA MASTAA (Ronaldo, Messi, Mbappe)
        String ronaldoHtml = tengenezaPejiMastaa("Cristiano Ronaldo", "https://upload.wikimedia.org/wikipedia/commons/8/8c/Cristiano_Ronaldo_2018.jpg");
        String messiHtml = tengenezaPejiMastaa("Lionel Messi", "https://upload.wikimedia.org/wikipedia/commons/c/c1/Lionel_Messi_20180626.jpg");
        String mbappeHtml = tengenezaPejiMastaa("Kylian Mbappe", "https://upload.wikimedia.org/wikipedia/commons/5/57/2019-07-17_SG_v_Dynamo_Dresden_%28Kylian_Mbapp%C3%A9%29.jpg");

        try {
            // Tengeneza faili zote 4
            hifadhiFaili("index.html", mainHtml);
            hifadhiFaili("website.html", ronaldoHtml);
            hifadhiFaili("apps.html", messiHtml);
            hifadhiFaili("games.html", mbappeHtml);

            // Fungua index.html
            File file = new File("index.html");
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(file.toURI());
                System.out.println("Website imekamilika! Fungua browser kuona Ronaldo, Messi na Mbappe.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method ya kusaidia kutengeneza HTML ya picha za mastaa
    public static String tengenezaPejiMastaa(String jina, String pichaUrl) {
        return "<!DOCTYPE html><html><head><meta charset='UTF-8'><title>" + jina + "</title>" +
                "<style>body{text-align:center; font-family:sans-serif; background:#2c3e50; color:white; padding-top:50px;}" +
                "img{width:400px; border-radius:15px; border:5px solid #ffd700; box-shadow: 0 0 20px rgba(0,0,0,0.5);}" +
                "a{color:#ffd700; text-decoration:none; font-weight:bold; display:block; margin-top:20px;}</style></head>" +
                "<body><h1>" + jina + "</h1><img src='" + pichaUrl + "' alt='" + jina + "'><br>" +
                "<a href='index.html'>← Rudi Nyumbani</a></body></html>";
    }

    // Method ya kuhifadhi faili
    public static void hifadhiFaili(String jina, String maudhui) throws IOException {
        FileWriter writer = new FileWriter(new File(jina));
        writer.write(maudhui);
        writer.close();
    }
}