function confirmacionEvento(event){
var confirmacion = confirm("¿Estas seguro que deseas eliminar esta entrada?");

if(!confirmacion)
{
    event.preventDefault();
}
}