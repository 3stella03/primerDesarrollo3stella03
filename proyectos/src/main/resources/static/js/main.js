document.addEventListener('DOMContentLoaded', () => {
	const elementosCarousel = document.querySelectorAll('.carousel');
	M.Carousel.init(elementosCarousel, {
		duration: 250, /*Rapidez del desplazamiento de las imágenes*/
		dist: -80,
		shift: 5,
		padding: 5,
		numVisible: 3,/*La cantidad de imagenes visibles en el carrusel*/
		indicators: true,
		noWrap: false
	}); 
});