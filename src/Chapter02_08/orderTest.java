package Chapter02_08;

public class orderTest {

	public static void main(String[] args) {
		
		order myOrder = new order();
		myOrder.orderNumber = "123124";
		myOrder.customerPhone = "010123124";
		myOrder.customerAddress = "°­³²";
		myOrder.orderDate = "20200202";
		myOrder.orderTime = "1302222";
		myOrder.price = 35000;
		myOrder.menuId = "0002";
		
		myOrder.showOrderDetail();
	}

}
