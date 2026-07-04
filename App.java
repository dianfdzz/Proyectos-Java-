static void main(){

int tamaño = 0;

String [] articulos;

  IO.println("Bienvenido");
  IO.println("Ingrese el tamaño de su arreglo");
  tamaño = Integer.parseInt(IO.readln());


articulos = new String[tamaño];

for(int i = 0; i < articulos.length; i++ ){
    articulos [i] = " ";

  while (articulos[i].length() <= 3) {

   IO.println("Ingrese el valor de la posicion " + i);
   articulos[i] = IO.readln();
  

}

}
IO.println("Valores del arreglo:");

  for (String articulo: articulos){
  IO.println(articulo);

}
 
IO.println("Valores en posiciones pares:");

for (int i = 0; i< articulos.length; i++){
  if (i % 2 ==0){
  IO.println(articulos[i]);

}
}
}
