package abhi.application;

import java.util.*;

public class Lebenslauf {

    private static final String VORNAME = "Abhinav";

    private static final String NACHNAME = "Prakash";

    private static final int GEBURTSJAHR = 1985;

    private static final String STAATSANGEHÖRIGKEIT = "Deutsch";

    private static final String TELEFONNUMMER = "+49 176 432 90311";

    private static final String EMAIL = "email@abhinav-prakash.de";

    private static final String LINKEDIN = "https://www.linkedin.com/in/abhinavprk/";

    private static final String ANSCHRIFT = "Landgraf-Philipps-Anlage 60, 64283 Darmstadt, Deutschland";
    
    private static final String SPRACHKENNTNISSE = "Englisch(C1), Deutsch(B1), Spanisch(A1), Hindi(Muttersprache)";

    private static final String ERFAHRUNG = "13 Jahre (9.5 Jahre Vollzeit und 4 Jahre Teilzeit)";

    private static final String EQUAL = "=====================================================================================================================";

    private static final String DASH = "---------------------------------------------------------------------------------------------------------------------";

    Lebenslauf(){
        System.out.println(EQUAL);
        System.out.println("                                            " + VORNAME + " " + NACHNAME);
        System.out.println(EQUAL);
    }
    public void getMyBasicInfo() {
        System.out.println("                                          Grundlegende Details");
        System.out.println("Staatsangehörigkeit:        "+STAATSANGEHÖRIGKEIT);
        System.out.println("Geburtsjahr:                "+GEBURTSJAHR);
        System.out.println("Telefonnummer:              "+TELEFONNUMMER);
        System.out.println("Email:                      "+EMAIL);
        System.out.println("LinkedIn:                   "+LINKEDIN);
        System.out.println("Anschrift:                  "+ANSCHRIFT);
        System.out.println("Sprachkenntnisse:           "+SPRACHKENNTNISSE);
        System.out.println("Professional Erfahrungen:   "+ERFAHRUNG);
        System.out.println(DASH);
    }

    public void getTechnologyToolsAndFrameworksIHaveWorkedWith() {
        Set<String> techs = new LinkedHashSet<>(List.of("Java", "Spring Boot", "OAuth2", "OpenID Connect",
                "Keycloak", "AWS", "Azure Active Directory",
                "Apache Camel", "Kafka", "Elasticsearch", "Grafana",
                "Angular", "TypeScript", "HTML", "CSS", "PL/SQL",
                "JUnit", "Mockito", "Jira", "Conﬂuence", "Maven",
                "Gradle", "Swagger", "Liquibase", "Flyway", "MariaDB",
                "MySQL", "PostgreSQL", "Docker", "Kubernetes",
                "SonarQube", "Postman", "Insomnia", "PoEditor",
                "Browserstack", "Firebase", "Git", "Gitlab",
                "Requirement Analysis and Design", "Scrum",
                "Kanban", "Agile Development"));
        System.out.println("                              Fähigkeiten\n");
        int length = 0;
        int count = 0;
        for (String val : techs) {
            length += val.length();
            count++;
            if ((length >= 63)) {
                length = 0;
                if (count != techs.size()) {
                    System.out.println(val + ", ");
                } else {
                    System.out.println(val);
                }
            } else if (count != techs.size()) {
                System.out.print(val + ", ");
            } else {
                System.out.print(val);
            }
        }
        System.out.println();
        System.out.println(DASH);

    }

    private void getExperienceAtAxxessio() {
        System.out.println("                              Berufserfahrung bei Axxessio GmbH(Oktober 2018 - Januar 2024)");
        System.out.println("Ausgeübte Positionen:");
        System.out.println("- Senior Software Engineer (März 2020 - Januar 2024)");
        System.out.println("- Associate Team Lead      (März 2021 - Oktober 2023)");
        System.out.println("- Software Engineer        (Oktober 2018 - Februar 2020)\n");
        System.out.println("Rollen und Verantwortlichkeiten: ");
        System.out.println("- Rollen als Software-Architekt/Senior Backend-Entwickler für die Kunden der Axxessio GmbH.");
        System.out.println("- Konzeptualisierung, Design und Implementierung von Cloud-basierten Microservices mit Spring Boot.");
        System.out.println("- Zusammenarbeit mit POs für die Machbarkeits- und technische Analyse von Anforderungen und Projektplanung.");
        System.out.println("- Zusammenarbeit mit Kunden und Drittanbietern für das Onboarding von Kunden und die Integration von" +
                " Drittanbieterdiensten in die Anwendung.");
        System.out.println("- Sprint und Product Backlog-Management.");
        System.out.println("- Überprüfung von Code und Prozessen im Hinblick auf die korrekte Umsetzung des Designs, bewährte Verfahren " +
                "bei der Produktentwicklung und sauberen Code.");
        System.out.println("- Erstellung von Entwicklungsplänen für die Teammitglieder und Unterstützung bei deren Umsetzung.");
        System.out.println("- Übernahme der Rolle des Scrum Master in Abwesenheit des Scrum Master des Teams.");
        System.out.println("- Mitarbeiter-Controlling (Abwesenheiten, Projektzeiten, Kosten, Auslastung).");
        System.out.println(DASH);

    }

    private void getExperienceAtOpRiskSolutions() {
        System.out.println("                     Berufserfahrung bei OpRiskSolutions International Ltd.(September 2014 - Dezember 2017)");
        System.out.println("Ausgeübte Positionen:");
        System.out.println("- Student Assistant (September 2014 - Dezember 2017)\n");
        System.out.println("Rollen und Verantwortlichkeiten:: ");
        System.out.println("- Entwicklung und Wartung von in Java und .Net geschriebenen Webanwendungen.");
        System.out.println("- Behebung von Störungen und Unterstützung.");
        System.out.println("- Einrichtung und Verwaltung von Jira- und Confluence-Servern vor Ort.");
        System.out.println("- Einrichtung und Verwaltung von VMware ESX-Servern.");
        System.out.println("- Netzwerk- und Infrastrukturverwaltung.");
        System.out.println("- Einrichtung und Konfiguration von ORACLE 11g und 12g DB");
        System.out.println(DASH);

    }

    private void getExperienceAtAccenture() {
        System.out.println("                     Berufserfahrung bei Accenture Services Pvt. Ltd. (März 2010 - Februar 2014)");
        System.out.println("Ausgeübte Positionen:");
        System.out.println("- Senior Software Engineer (September 2013 - Februar 2014)");
        System.out.println("- Software Engineer (September 2011 - August 2013)");
        System.out.println("- Associate Software Engineer (März 2010 - August 2011)\n");
        System.out.println("Rollen und Verantwortlichkeiten: ");
        System.out.println("- Entwicklung und Wartung von Java-basierten Webanwendungen.");
        System.out.println("- Anforderungsanalyse & Anwendungsdesign.");
        System.out.println("- Incident management.");
        System.out.println("- Team Management.");
        System.out.println("- Durchführung von Java-Schulungen.");
        System.out.println(DASH);
    }

    public void getProfessionalExperienceDetails(){
        System.out.println("                                             Berufserfahrungen");
        System.out.println(DASH);
        getExperienceAtAxxessio();
        getExperienceAtOpRiskSolutions();
        getExperienceAtAccenture();
    }

    public void getMyEducationDetails(){
        System.out.println("                                             Details zur Ausbildung\n");
        System.out.println("           Abschluss                                          Schule                                 Jahr\n");
        System.out.println("MSc(Distributed Software Systems)                       TU Darmstadt, Germany                     2018");
        System.out.println("Bachelor of Engineering(Computer Science)               IET, Khandari, Agra, India                2009");
        System.out.println(DASH);
    }

    public void getDetailsOfCertificationsIHave(){
        System.out.println("                                              Zertifizierungen\n");
        System.out.println("- AWS Certified Cloud Practitioner (Januar 2023 – Januar 2025)");
        System.out.println("- Professional Scrum Developer I");
        System.out.println("- Professional Scrum Master I");
        System.out.println("- Professional Scrum Product Owner I");
        System.out.println(DASH);
    }

}
