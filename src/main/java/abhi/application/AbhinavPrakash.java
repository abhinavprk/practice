package abhi.application;

/**
 *
 *  Sehr geehrte Damen und Herren,
 *
 *  Ich, Abhinav Prakash, interessiere mich für die von der Main Method GmbH
 *  angebotene Stelle des "Principal Java Developer".
 *
 *  Ich habe mehr als 13 Jahre Erfahrung mit dem Design, der Entwicklung und der Wartung von
 *  Java-basierten Anwendungen. Dies umfasst monolithische bis microservice-basierte Anwendungen.
 *  Die letzten beiden Projekte, an denen ich gearbeitet habe, dienten der Entwicklung einer mobilen
 *  und einer Web-Anwendung, die auf den mit Spring Boot und unterstützenden Technologien und Frameworks
 *  entwickelten Microservices basieren.
 *
 *  Ich habe im Moment keine Kündigungsfrist. Ich arbeite zurzeit nicht, weil ich in Indien bin und meinen
 *  kranken Vater pflege. Wenn ich von Indien aus arbeiten kann, kann ich es ab dem 1. Juni 2024 tun,
 *  ansonsten ab dem 1. September 2024.
 *
 *  Meine Gehaltsvorstellungen für diese Stelle liegen zwischen 90 und 100 000 Euro pro Jahr. Natürlich
 *  kann darüber verhandelt werden, nachdem wir uns besser kennengelernt haben.
 *
 *  Bitte nutzen Sie die entsprechenden Methoden, um mehr über mich zu erfahren. Die
 *  erforderlichen Java-Dateien sind dieser E-Mail beigefügt. Ich habe auch das Arbeitszeugnis
 *  beigefügt, das ich von meinem letzten Arbeitgeber erhalten habe.
 *
 *  Wenn Sie direkt einen Blick auf meinen Lebenslauf werfen wollen, habe ich eine pdf-Version davon an diese
 *  E-Mail angehängt.
 *
 *  Hinweis: Ich befinde mich derzeit in Indien und bin daher nur per E-Mail oder unter meiner indischen
 *  Telefonnummer +91 7070108991 zu erreichen.
 *
 *  Mit freundlichen Grüßen
 *  Abhinav Prakash
 *
 */
public class AbhinavPrakash {

    public static void main(String[] args) {
        Lebenslauf lebenslauf = new Lebenslauf();

        //Hier finden Sie die wichtigsten Informationen über mich.
        lebenslauf.getMyBasicInfo();

        //Hier finden Sie die Liste der Fähigkeiten, die ich habe.
        lebenslauf.getTechnologyToolsAndFrameworksIHaveWorkedWith();

        //Hier finden Sie die Berufserfahrung, die ich habe.
        lebenslauf.getProfessionalExperienceDetails();

        //Hier finden Sie Informationen über Schulen, die ich besucht habe.
        lebenslauf.getMyEducationDetails();

        //Hier finden Sie Informationen über die Zertifizierungen, die ich habe.
        lebenslauf.getDetailsOfCertificationsIHave();

        System.out.println("Hat Ihnen mein Lebenslauf gefallen? " +
                "Dann schicken Sie mir bitte eine Email an email@abhianv-prakash.de");
    }
}
