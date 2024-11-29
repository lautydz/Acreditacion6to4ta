def calcularPrecioConDescuento(precioOriginal, descuento):
    # Calcular el valor de la reducción
    cantidadDescuento = precioOriginal * (descuento / 100)
    # Calcular el precio final
    precioFinal = precioOriginal - cantidadDescuento
    # Devolver el precio final
    return precioFinal

# Ejemplo de uso
precio_original = 100.0  # Precio original del producto
porcentaje_descuento = 20  # Descuento en porcentaje

precio_final = calcularPrecioConDescuento(precio_original, porcentaje_descuento)
print(f"El precio final después de aplicar el descuento es: {precio_final}")