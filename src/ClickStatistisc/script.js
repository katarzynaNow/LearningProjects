window.onload = function () {

    let clickCounter = 0;
    let doubleCounter = 0;
    let keyDownCounter = 0;

    document.addEventListener('click', function () {
       document.getElementById('click-counter').textContent = ++clickCounter;
    });

    document.addEventListener('dblclick', function () {
       document.getElementById('double-click-counter').textContent = ++ doubleCounter;
    });

    document.addEventListener('keydown', function () {
        document.getElementById('key-down-counter').textContent = ++ keyDownCounter;
    });

};