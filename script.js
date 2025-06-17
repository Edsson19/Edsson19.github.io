
function mostrar(id) {
  document.querySelectorAll('.section').forEach(s => s.style.display = 'none');
  const sec = document.getElementById(id);
  sec.style.display = id === 'inicio' ? 'flex' : 'block';
  document.getElementById('submenu').classList.remove('open');
  window.scrollTo(0, 0);
}

function toggleSubmenu() {
  document.getElementById('submenu').classList.toggle('open');
}

window.onload = () => mostrar('inicio');

function enviarSoporte(e) {
  e.preventDefault();
  alert('Mensaje enviado');
  e.target.reset();
}
