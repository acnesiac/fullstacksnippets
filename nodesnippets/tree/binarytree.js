var tree;

function setup() {
    tree = new Tree();
}

Tree.prototype.add = function () {
console.log('hello');
}

function Tree() {


}

function Node() {
    var root = null;
    var next = null;
}

setup();
tree.add();


