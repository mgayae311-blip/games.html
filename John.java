import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Desktop;

public class John {
    public static void main(String[] args) {
        // 1. KODI YA PEJI KUU (INDEX.HTML)
        String mainHtml = "<!DOCTYPE html>\n" +
                "<html lang='sw'>\n" +
                "<head>\n" +
                "    <meta charset='UTF-8'>\n" +
                "    <title>King Kipamoja Tech</title>\n" +
                "    <style>\n" +
                "        body { font-family: 'Poppins', sans-serif; margin: 0; background-color: #f4f7f6; color: #333; scroll-behavior: smooth; }\n" +
                "        nav { background: #2c3e50; color: white; padding: 15px 50px; display: flex; justify-content: space-between; align-items: center; position: sticky; top: 0; z-index: 1000; }\n" +
                "        .hero { background: linear-gradient(rgba(0,0,0,0.7), rgba(0,0,0,0.7)), url('https://images.unsplash.com/photo-1517694712202-14dd9538aa97?auto=format&fit=crop&w=1350&q=80'); \n" +
                "                height: 400px; background-size: cover; background-position: center; color: white; \n" +
                "                display: flex; flex-direction: column; justify-content: center; align-items: center; text-align: center; }\n" +
                "        .container { padding: 40px; max-width: 1100px; margin: auto; text-align: center; }\n" +
                "        .services { display: flex; justify-content: space-around; gap: 20px; margin-top: 30px; }\n" +
                "        .card { background: white; padding: 25px; border-radius: 10px; box-shadow: 0 4px 15px rgba(0,0,0,0.1); flex: 1; }\n" +
                "        .btn-small { background: #e74c3c; color: white; padding: 10px 20px; border-radius: 5px; text-decoration: none; display: inline-block; margin-top: 15px; font-weight: bold; }\n" +
                "        .reg-form { background: white; padding: 40px; border-radius: 15px; box-shadow: 0 5px 25px rgba(0,0,0,0.2); max-width: 500px; margin: 40px auto; text-align: left; }\n" +
                "        input, select { width: 100%; padding: 12px; margin: 10px 0; border: 1px solid #ddd; border-radius: 5px; box-sizing: border-box; }\n" +
                "        .btn-db { background: #e74c3c; color: white; width: 100%; padding: 15px; border: none; border-radius: 30px; font-size: 18px; font-weight: bold; cursor: pointer; }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <nav><div style='font-size: 24px;'>👑 KING<b>KIPAMOJA</b></div></nav>\n" +
                "    <div class='hero'><h1>WELCOME TO KING KIPAMOJA</h1></div>\n" +
                "    <div class='container'>\n" +
                "        <h2>Huduma Tunazotoa</h2>\n" +
                "        <div class='services'>\n" +
                "            <div class='card'><h3>Website Creator</h3><a href='website.html' class='btn-small'>Fungua</a></div>\n" +
                "            <div class='card'><h3>App Development</h3><a href='apps.html' class='btn-small'>Fungua</a></div>\n" +
                "            <div class='card'><h3>Game Design</h3><a href='games.html' class='btn-small'>Fungua</a></div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    <div class='reg-form'>\n" +
                "        <h2>Usajili wa Database</h2>\n" +
                "        <input type='text' id='fullName' placeholder='Full Name'>\n" +
                "        <input type='text' id='address' placeholder='Place Address'>\n" +
                "        <button class='btn-db' onclick='alert(\"Data zimehifadhiwa King Kipamoja Database!\")'>HIFADHI DATABASE</button>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";

        // 2. KODI YA PEJI ZA MASTAA NA WEWE
        String ronaldoHtml = tengenezaPeji("Cristiano Ronaldo", "https://upload.wikimedia.org/wikipedia/commons/8/8c/Cristiano_Ronaldo_2018.jpg");
        String messiHtml = tengenezaPeji("Lionel Messi", "https://upload.wikimedia.org/wikipedia/commons/c/c1/Lionel_Messi_20180626.jpg");

        // Jina la picha hapa (mimi.jpg) lazima lifanane na jina la file lililopo kwenye folder
        String gamesHtml = tengenezaPeji("King Kipamoja (Mtaalamu)", "mimi.jpg");

        try {
            hifadhiFaili("index.html", mainHtml);
            hifadhiFaili("website.html", ronaldoHtml);
            hifadhiFaili("apps.html", messiHtml);
            hifadhiFaili("games.html", gamesHtml);

            File file = new File("index.html");
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(file.toURI());
            }
        } catch (IOException e) { e.printStackTrace(); }
    }

    public static String tengenezaPeji(String jina, String pichaUrl) {
        return "<!DOCTYPE html><html><head><meta charset='UTF-8'><style>" +
                "body{text-align:center; font-family:sans-serif; background:#2c3e50; color:white; padding-top:50px;}" +
                "img{max-width:450px; border-radius:20px; border:8px solid #e74c3c; box-shadow: 0 10px 30px rgba(0,0,0,0.5);}" +
                "a{color:#e74c3c; text-decoration:none; font-weight:bold; display:block; margin-top:20px; font-size:20px;}" +
                "</style></head><body>" +
                "<h1>" + jina + "</h1>" +
                "<img src='" + pichaUrl + "' alt='Picha: " + jina + "'><br>" +
                "<a href='index.html'>← Rudi Nyumbani</a>" +
                "</body></html>";
    }

    public static void hifadhiFaili(String jina, String data) throws IOException {
        FileWriter writer = new FileWriter(new File(jina));
        writer.write(data);
        writer.close();
    }
}