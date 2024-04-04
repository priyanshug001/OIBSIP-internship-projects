function addItem() {
    var input = document.getElementById("ItemInput");
    var inputdes = document.getElementById("ItemDesInput");
    
    var item = input.value;
    var itemdes = inputdes.value;
    
    if (item === "") {
        alert("Please enter a item!");
        return;
    }
    var ul = document.getElementById("itemList");
    var li = document.createElement("li");
    var ItemList = document.createElement("list");
    ItemList.appendChild(document.createTextNode(item + "  :"));
    li.appendChild(ItemList);

    var description = document.createElement("list");
    description.appendChild(document.createTextNode("\t"+itemdes));
    li.appendChild(description);
    
    // Create delete button
    var deleteButton = document.createElement("span");
    deleteButton.className = "delete";
    deleteButton.appendChild(document.createTextNode("\u00D7"));
    deleteButton.onclick = function() {
        var li = this.parentElement;
        li.style.display = "none";
    };
    li.appendChild(deleteButton);
    ul.appendChild(li);
    input.value = "";
    inputdes.value = ""; // Clear input field
}
