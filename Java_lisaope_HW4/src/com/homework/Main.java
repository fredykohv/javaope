package com.homework;

public class Main {

    public static void main(String[] args) {
        Aine aine = new Aine();
        Oppekava oppekava = new Oppekava();

        aine.setAineKood("RT-016");
        aine.setAineNimetus("Objektorienteeritud programmeerimine ");
        aine.setAinePunktideArv(5);
        System.out.println(aine.getAineKood());
        System.out.println(aine.getAineNimetus());
        System.out.println(aine.getAinePunktideArv());

        System.out.println(aine);
        aine.tundideArv();

        oppekava.setOppekavaKood("207866");
        Aine[] ained = {
                new Aine("RT-002", "ENESEJUHTIMINE", 4),
                new Aine("RT-003", "KOOSTÖÖMUDELID", 2),
                new Aine("RT-004", "SUHTLEMISPSÜHHOLOOGIA", 4),
                new Aine("RT-005", "DISKREETNE MATEMAATIKA JA LOOGIKA", 5),
                new Aine("RT-006", "LINEAARALGEBRA", 5),
                new Aine("RT-007", "IT SOTSIAALSED JA EETILISED ALUSED", 2),
                new Aine("RT-008", "UURIMISTÖÖ MEETODID", 5),
                new Aine("RT-009", "ANDMEANALÜÜS", 3),
                new Aine("RT-010", "OPERATSIOONISÜSTEEMID", 3),
                new Aine("RT-011", "ARVUTID JA ARVUTIVÕRGUD", 2),
                new Aine("RT-012", "PROGRAMMEERIMISE ALUSED", 5),
                new Aine("RT-013", "ANDMETURVE", 4),
                new Aine("RT-014", "PROGRAMMEERIMINE KEELES C", 6),
                new Aine("RT-015", "SISSEJUHATAV ERIALAPRAKTIKA", 5),
                new Aine("RT-016", "OBJEKTORIENTEERITUD PROGRAMMEERIMINE", 5),
                new Aine("RT-017", "ANDMEBAASID", 4),
                new Aine("RT-018", "VEEBIRAKENDUSED", 5),
                new Aine("RT-019", "KASUTAJALIIDESE PROTOTÜÜPIMINE", 2),
                new Aine("RT-020", "AUTOMAATTESTIMINE", 4),
                new Aine("RT-021", "TARKVARATEHNIKA ERIALAPRAKTIKA", 10),
                new Aine("RT-022", "AUTOMAATTESTIMISE ERIALAPRAKTIKA", 10),
                new Aine("RT-023", "AUTOMAATJUHTIMINE", 5),
                new Aine("RT-024", "SISSEJUHATUS MEHHATROONIKASSE", 5),
                new Aine("RT-025", "PROGRAMMEERITAVAD JUHTSEADMED", 5),
                new Aine("RT-026", "MEHHATROONIKA SÜSTEEMI PROJEKTEERIMINE", 5),
                new Aine("RT-027", "SERVOMOOTORID", 5),
                new Aine("RT-028", "ROBOOTIKA ERIALAPRAKTIKA", 10),
                new Aine("RT-029", "AUTOMAATJUHTIMISE ERIALAPRAKTIKA", 10),
                new Aine("RT-030", "TARKVARATEHNIKA MEESKONNAPROJEKT", 5),
                new Aine("RT-031", "ROBOOTIKATARKVARA ARENDUSE ERIALAPRAKTIKA (PROJEKT)", 10),
                new Aine("RT-032", "LÕPUTÖÖ (PROJEKT)", 10)
        };

                oppekava.setAined(ained);
                System.out.println(oppekava.getAined()[0]);
                System.out.println(oppekava.getAined()[1]);
                System.out.println(oppekava.getAined()[2]);
                System.out.println(oppekava.getAined()[3]);
                System.out.println(oppekava.getAined()[4]);
                System.out.println(oppekava.getAined()[5]);
                System.out.println(oppekava.getAined()[6]);
                System.out.println(oppekava.getAined()[7]);
                System.out.println(oppekava.getAined()[8]);
                System.out.println(oppekava.getAined()[9]);
                System.out.println(oppekava.getAined()[10]);
                System.out.println(oppekava.getAined()[11]);
                System.out.println(oppekava.getAined()[12]);
                System.out.println(oppekava.getAined()[13]);
                System.out.println(oppekava.getAined()[14]);
                System.out.println(oppekava.getAined()[15]);
                System.out.println(oppekava.getAined()[16]);
                System.out.println(oppekava.getAined()[17]);
                System.out.println(oppekava.getAined()[18]);
                System.out.println(oppekava.getAined()[19]);
                System.out.println(oppekava.getAined()[20]);
                System.out.println(oppekava.getAined()[21]);
                System.out.println(oppekava.getAined()[22]);
                System.out.println(oppekava.getAined()[23]);
                System.out.println(oppekava.getAined()[24]);
                System.out.println(oppekava.getAined()[25]);
                System.out.println(oppekava.getAined()[26]);
                System.out.println(oppekava.getAined()[27]);
                System.out.println(oppekava.getAined()[28]);
                System.out.println(oppekava.getAined()[29]);


                System.out.println(oppekava);


    }
}
