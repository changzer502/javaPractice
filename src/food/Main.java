package food;

/**
 * @author lingqu
 * @date 2022/8/23
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        String[] foods = new String[]{
                "冒菜","烧烤","炸鸡","干锅","土豆","豆干+酱香饼","奶茶蛋糕","曹氏鸭脖","寿司","抄手","中餐","肥肠粉"
        };
        System.out.println(foods[(int)(Math.random()*(foods.length))]);
        //System.out.println();
    }
}
