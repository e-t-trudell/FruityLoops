import models.Item;
public class VendingMachineTest {
    public static void main(String[] args){
        Item snickers = new Item("Snickers", .75, 10);
        Item butterfinger = new Item("Butterfinger", .75, 10);
        Item twix = new Item("Twix", .75, 10);
        Item kitkat = new Item("Kitkat", .75, 10);
        Item popcorn = new Item("Popcorn", .75, 10);
        Item twinkie = new Item("Twinkie", .75, 10);
        Item pringles = new Item("Pringles", .75, 10);
        Item cheetos = new Item("Cheetos", .75, 10);
        Item doritos = new Item("Doritos", .75, 10);
        Item skittles = new Item("Skittles", .75, 10);
        Item cookies = new Item("Cookies", .75, 10);
        Item gum = new Item("Gum", .75, 10);

        Item[][] machineContents = {{snickers, butterfinger, twix},{kitkat, popcorn, twinkie},{pringles, cheetos, doritos},{skittles, cookies, gum}};
        VendingMachine snackAttack = new VendingMachine(machineContents);
        snackAttack.despositMoney(5.00);
        Item itemBought = snackAttack.buy("c,1");
        System.out.println(itemBought.getName());
        snackAttack.refund();
        // %.2f gets you two decimal places on the float(f)
        System.out.println(String.format("Here is your $%.2f back!" , snackAttack.refund()));
        
    }
    }

