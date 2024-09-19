import java.util.Scanner;

class Order {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int distance , quantity, cost, Amount,charge =0;
		int type;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the type of food\n1 for veg \n2 for Non-veg");
		type = sc.nextInt();
		System.out.println("Quantity to order");
		quantity = sc.nextInt();
		System.out.println("Distance");
		distance = sc.nextInt();
		if(type == 1 || type == 2 && quantity >=1 && distance >=0){
			if (type== 1){
				cost = 12;
				if(distance<=3){
					charge = 0;
				}
					else if (distance >3 && distance<= 6){
						charge = 1;
					}
					else if (distance >6){
						charge = 2;
					}
					Amount = quantity*cost+charge;
					System.out.println("Amount to be paid "+ Amount);
				
			}
			else{
				cost =15;
				if(distance<=3){
					charge = 0;
				}
					else if (distance >3 && distance<= 6){
						charge = 1;
					}
					else if (distance >6){
						charge = 2;
					}
					Amount = quantity*cost+charge;
					System.out.println("Amount to be paid "+ Amount);

			}
		}
		else{
			System.out.println("Select the Correct type of food");
		}
		

	}}
