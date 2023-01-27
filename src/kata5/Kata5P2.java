package kata5;

import java.util.List;

import kata5.model.Histogram;
import kata5.model.Mail;
import kata5.view.HistogramDisplay;
import kata5.view.MailHistogramBuilder;
import kata5.view.MailListReaderDB;

public class Kata5P2 {

    public static void main(String[] args) {
        MailListReaderDB mailListReader = new MailListReaderDB("jdbc:sqlite:kata5P1.db");
        List<Mail> mailList = mailListReader.read();
        MailHistogramBuilder mailHistogramBuilder = new MailHistogramBuilder();
        Histogram<String> histogram = mailHistogramBuilder.build(mailList);
        new HistogramDisplay(histogram).execute();

    }

}
