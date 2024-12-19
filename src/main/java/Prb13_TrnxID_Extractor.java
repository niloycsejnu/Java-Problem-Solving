import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Prb13_TrnxID_Extractor {
    public static void main(String[] args) {
        String html = """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Transactions</title>
                </head>
                <body>
                    <div>
                        <div class="button">
                            <p>Transaction Id: TXN1234</p>
                        </div>
                    </div>
                </body>
                </html>
                """;

        Document document = Jsoup.parse(html);
        Element transactionElement = document.select("div.button > p").first();
        if (transactionElement != null) {
            String transactionText = transactionElement.text();
            System.out.println(transactionText);
        } else {
            System.out.println("Transaction ID is not found!");
        }
    }
}
