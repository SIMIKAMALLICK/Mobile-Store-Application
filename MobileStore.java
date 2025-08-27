// Manage Store
class MobileStore {
	Mobile[] mobiles;
	int count;
	
	MobileStore(int size) {
		mobiles = new Mobile[size];
		count = 0;
	}
	void addMobile(Mobile m) {
		if (count < mobiles.length) {		
			mobiles[count++] = m;
			System.out.println("Mobile added successfully!");
		} else {
			System.out.println("Store is full, cannot add more.");
		}
	}
	void viewMobiles() {
		if (count == 0) {
			System.out.println(" No mobiles available.");
			return;
		}
		System.out.println("\n--- Available Mobiles ---");
		for (int i = 0; i < count; i++) {
			System.out.println(mobiles[i]);
		}
	}
	void searchMobile(int id) throws MobileNotFoundException {
		for (int i = 0; i < count; i++) {
			if (mobiles[i].id == id) {
				System.out.println(" Found: " + mobiles[i]);
				return;
			}
		}
		throw new MobileNotFoundException("Mobile with ID " + id + " not found!");
	}
	void buyMobile(int id) throws MobileNotFoundException, OutOfStockException {
		for (int i = 0; i < count; i++) {
			if (mobiles[i].id == id) {
				if (mobiles[i].stock > 0) {
					mobiles[i].stock--;
					System.out.println("Purchase successful! You bought: " + mobiles[i].brand);
					return;
				} else {
					throw new OutOfStockException("Mobile " + mobiles[i].brand + " " + mobiles[i].model + " is out of stock!");
				}
			}	
		}	
		throw new MobileNotFoundException("Mobile with ID " + id + " not found!");
	}
}
