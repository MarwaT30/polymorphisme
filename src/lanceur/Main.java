package lanceur;

import model.Animal;
import model.Chat;
import model.Felin;
import model.Oiseau;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chat chat1 = new Chat();
		Chat chat2 = new Chat();
		Chat chat3 = new Chat();
		Chat chat4 = new Chat();
		Chat chat5 = new Chat();

		Oiseau oiseau1 = new Oiseau();
		Oiseau oiseau2 = new Oiseau();
		Oiseau oiseau3 = new Oiseau();
		Oiseau oiseau4 = new Oiseau();
		Oiseau oiseau5 = new Oiseau();

		Felin felin1 = new Felin();
		Felin felin2 = new Felin();
		Felin felin3 = new Felin();
		Felin felin4 = new Felin();
		Felin felin5 = new Felin();

		Animal[] tab = { chat1, chat2, chat3, chat4, chat5, oiseau1, oiseau2, oiseau3, oiseau4, oiseau5, felin1, felin2,
				felin3, felin4, felin5 };

		// for (Animal an : tab) {
//			an.crie();
//		}

		for (int i = 0; i < tab.length; i++) {
			tab[i].crie();

		}

	}

}
