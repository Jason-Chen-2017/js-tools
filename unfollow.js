var items = document.getElementsByClassName('subed-btn');
for (let index = items.length - 1; index > items.length - 100; index--) {
    items[index].click();
}