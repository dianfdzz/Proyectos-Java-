static void main(){

 String nombre = "";
 String producto = "";
 double precio = 0.00;
 double ITBIS = 1.18;
 boolean procesado = false;
 double precioTotal = 0.00;

IO.println("Bienvenido");

while (procesado == false){
 IO.println("Ingrese su nombre");
 nombre = (IO.readln());



if (nombre.length() >= 3){
 nombre = nombre.toUpperCase();}
else {
 break;
}


IO.println("Ingrese el nombre del producto");
 producto = (IO.readln());
 
if (producto.length() >= 3) {
producto = producto.toUpperCase();}
else {
 break;
}

IO.println("Ingrese precio de producto");
 precio = Double.parseDouble(IO.readln());

if (precio > 0) {
 precioTotal = (precio * ITBIS);
 }
else {
 break;
}
 
procesado = true;

}

IO.println("Saludos " + nombre + ". El precio total del articulo: " + producto + ", con impuestos incluidos es de: " + precioTotal);

}



 

