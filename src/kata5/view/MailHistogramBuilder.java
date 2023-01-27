package kata5.view;

import kata5.model.Histogram;
import kata5.model.Mail;

import java.util.List;

public class MailHistogramBuilder {

    public Histogram<String> build(List<Mail> mails) {
        Histogram<String> histogram = new Histogram<>();

        for (Mail mail : mails) {
            histogram.increment(mail.getDomain());
        }

        return histogram;
    }
}
