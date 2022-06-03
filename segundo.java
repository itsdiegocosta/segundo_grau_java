class Main {
  public static void main(String[] args) {
    		var a = digite um numero;
		var b = digite um numero;
		var c = digite um numero;
		var delta = Math.pow(b, 2) - 4 * a * c;
		var deltar = Math.pow(delta, 0.5);

		var x1 = (-b + deltar) / 2 * a;
		var x2 = (-b - deltar) / 2 * a;

		System.out.println(x1);
		System.out.println(x2);
		System.out.println(delta);
  }
}
