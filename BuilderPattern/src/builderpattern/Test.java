package builderpattern;

/**
 * ������
 */
public class Test {
    public static void main(String[] args) {

        MealA a = new MealA();//�����ײ�A����
        KFCServer waitera = new KFCServer(a);//׼���ײ�A�ķ���Ա
        Meal mealA = waitera.construct();//����ײ�A
        System.out.print("�ײ�A����ɲ���:");
        System.out.println("ʳ�"+mealA.getFood()+"��   "+"��Ʒ��"+mealA.getDrink());

        MealB b = new MealB();
        KFCServer waiterb = new KFCServer(b);
        Meal mealB = waiterb.construct();
        System.out.print("�ײ�B����ɲ���:");
        System.out.println("ʳ�"+mealB.getFood()+"��   "+"��Ʒ��"+mealB.getDrink());
    }
}

