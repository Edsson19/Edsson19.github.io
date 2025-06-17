function mostrar(id) {
  // Ocultar todas las secciones
  let secciones = document.querySelectorAll('.section');
  secciones.forEach(seccion => {
    seccion.style.display = 'none';
  });
  // Mostrar la sección solicitada
  const seccion = document.getElementById(id);
  if (seccion) {
    seccion.style.display = 'block';
  }
  // Cerrar submenu si está abierto
  const submenu = document.getElementById('submenu');
  if (submenu.classList.contains('open')) {
    submenu.classList.remove('open');
  }
}

function toggleSubmenu() {
  const submenu = document.getElementById('submenu');
  submenu.classList.toggle('open');
}

function enviarSoporte(event) {
  event.preventDefault();
  const email = document.getElementById('email').value.trim();
  const mensaje = document.getElementById('mensaje').value.trim();

  if (email === '' || mensaje === '') {
    alert('Por favor, completa todos los campos.');
    return;
  }

  alert('Mensaje enviado correctamente. Gracias por contactar.');
  document.getElementById('email').value = '';
  document.getElementById('mensaje').value = '';
}

// Mostrar la sección de inicio por defecto al cargar la página
window.onload = function() {
  mostrar('inicio');
};
