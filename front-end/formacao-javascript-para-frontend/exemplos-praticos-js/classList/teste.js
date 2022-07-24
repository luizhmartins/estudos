// Declare the Elements
var box = document.getElementById('box'),
    add = document.getElementById('add'),
    remove = document.getElementById('remove'),
    toggle = document.getElementById('toggle');

/** Set the functions
*/

// Adds class "class" to box
function addClass() {
  if (!hasClass()){ // If the element does NOT have the class "class", add it.
    return box.classList.add('class');
  }
}

// Removes class "class" from box
function removeClass() {
  if (hasClass()) { // If the element DOES have the class "class", remove it.
    return box.classList.remove('class'); 
  }
}

// Toggles the class "class" from the box
function toggleClass() {
  return box.classList.toggle('class');
}

// Checks if the box has class "class"
function hasClass() {
  return box.classList.contains('class');
}

// Add Event Listeners to the buttons
add.addEventListener('click', addClass);
remove.addEventListener('click', removeClass);
toggle.addEventListener('click', toggleClass);