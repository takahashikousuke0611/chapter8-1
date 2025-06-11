//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("ミナト");
        System.out.println(h1.hp);
        System.out.println(h1.name);

        Hero h2 = new Hero();
        System.out.println(h2.hp);
        System.out.println(h2.name);
        /*Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        w.heal(h1);   //ミナトを回復させる
        w.heal(h2);   //アサカを回復させる
        w.heal(h2);   //アサカを回復させる
        Sword s = new Sword();
        s.name ="炎の剣";
        s.damage = 10;
        Hero h = new Hero();
        h.name = "ミナト";
        h.hp = 100;
        h.sword = s;
        System.out.println("現在の武器は" + h.sword.name);*/

       /*Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        //行動パターン選択
        h.sit(70);
        h.slip();
        h.sit(95);
        h.run();*/
    }
}