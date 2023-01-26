import dao.RvDao;
import models.Personne;
import models.RendezVous;
import services.RvService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        RvDao rvdaoList = new RvDao();
        RvService service = new RvService();
        service.setRvDao(rvdaoList);
        List<RendezVous> rendezVous = new ArrayList<>();
        List<Personne> personnes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            menu();
            choice = scanner.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("==== LISTE DES RENDEZ-VOUS ====");
                        rendezVous = service.rendezVousList();
                        rendezVous.stream().forEach(System.out::println);

                      break;
                case 2 :
                    System.out.println("===== RENDEZ_VOUS D'UN PATIENT ====");

                    break;
                default:
                    break;

            }

        }while (choice != 3);
    }



    private static void menu(){
        System.out.println("====== MENU ======");
        System.out.println("1- Lister tous les rendez-vous");
        System.out.println("2- Lister les rendez-vous d'un patient");
        System.out.println("3- Enregistrer rendez-vous");
        System.out.println("4- Valider rendez-vous");
        System.out.println("5- Quitter");
    }
}
