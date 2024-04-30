package abhi.application;

import java.util.*;

public class Abhinav {

    private static final String VORNAME = "Abhinav";

    private static final String NACHNAME = "Prakash";

    private static final int GEBURTSJAHR = 1985;

    private static final String STAATSANGEHÖRIGKEIT = "Deutsch";

    private static final String TELEFONNUMMER = "+49 176 432 90311";

    private static final String EMAIL = "email@abhinav-prakash.de";

    private static final String LINKEDIN = "https://www.linkedin.com/in/abhinavprk/";

    private static final String WOHNORT = "Darmstadt, Deutschland";

    private static final String EQUAL = "=====================================================================================================================";

    private static final String DASH = "-----------------------------------------------------------------------------------------------------------------------";

    public void getBasicDetails() {
        var details = STR."""
                \{EQUAL}
                                                \{VORNAME} \{NACHNAME}
                \{EQUAL}
                Staatsangehörigkeit:    \{STAATSANGEHÖRIGKEIT}
                Geburtsjahr:            \{GEBURTSJAHR}
                Telefonnummer:          \{TELEFONNUMMER}
                Email:                  \{EMAIL}
                LinkdIn:                \{LINKEDIN}
                Wohnort:                \{WOHNORT}
                \{DASH}""";
        System.out.println(details);
    }

    public void getTechnologyToolsAndFrameworks() {
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
        System.out.println("                              Tools & Technologies\n");
        int length = 0;
        int count = 0;
        for (String val : techs) {
            length += val.length();
            count++;
            if ((length >= 63)) {
                length = 0;
                if (count != techs.size()) {
                    System.out.println(STR."\{val}, ");
                } else {
                    System.out.println(STR."\{val}");
                }
            } else if (count != techs.size()) {
                System.out.print(STR."\{val}, ");
            } else {
                System.out.print(STR."\{val}");
            }
        }
        System.out.println();
        System.out.println(STR."\{DASH}");

    }

    public void getExperienceFromAxxessio() {
        System.out.println("                              Professional Experience");
        System.out.println(STR."\{DASH}");
        System.out.println("                        Axxessio GmbH(Oct 2018 - Jan 2024)\n");
        System.out.println("Positions Held: ");
        System.out.println("- Senior Software Engineer (Mar 2020 - Jan 2024)");
        System.out.println("- Associate Team Lead      (Mar 2021 - Oct 2023)");
        System.out.println("- Software Engineer        (Oct 2018 - Feb 2020)\n");
        System.out.println("Roles and Responsibilities: ");
        System.out.println("- Rollen als Software-Architekt/Senior Backend-Entwickler für die Kunden der Axxessio GmbH");
        System.out.println("- Entwicklung von neuen Funktionen und Verbesserungen durch Beiträge in Form von Design und\n" +
                "Implementierung der Backend-Anwendung.");
        System.out.println("- Unterstützung von Städten und externen Anbietern beim Onboarding und der Integration mit der\n" +
                "Anwendung als technischer Ansprechpartner des Teams.");
        System.out.println("- Zusammenarbeit mit den Stakeholdern (POs, Frontend, Backend, Test und DevOps), um sicherzustellen,\n" +
                "dass alle bezüglich der Anforderungen und Erwartungen auf derselben Seite stehen.");
        System.out.println("- Arbeit als Wissensbasis für Anwendungen, um einen reibungslosen Wissens- und Informationsfluss\n" +
                "zwischen den Beteiligten innerhalb und außerhalb des Teams zu ermöglichen.");
        System.out.println("- Zusammenarbeit mit dem Backend-Team zur Aufrechterhaltung der Qualität der Entwicklung durch\n" +
                "Durchführung von Reviews und ggf. Unterstützung bei der Implementierung.");
        System.out.println("- Unterstützung der POs bei der Erstellung von User Stories, um ein Gleichgewicht zwischen technischen \n" +
                "und geschäftlichen Aspekten zu ermöglichen, sowie Beratung bei der Minimierung/Management von\n" +
                "Abhängigkeiten zwischen Frontend- und Backend-Entwicklung.");
        System.out.println("- Arbeiten darauf hin, das Team zu motivieren, gute Softwareentwicklungspraktiken bei der\n" +
                "Anwendungsentwicklung zu befolgen.");
        System.out.println("- Übernahme der Rolle des Scrum Master in Abwesenheit des Scrum Master des Teams.");
        System.out.println(STR."\{DASH}");

    }
}
