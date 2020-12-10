#include "bst.h"

node_t* 
Node(int data) {
    node_t* node = (node_t*) malloc(sizeof(node_t));
    node->data = data;
    node->left = NULL;
    node->right = NULL;
    return node;
}

tree_t* 
create_tree() {
    tree_t* _bst = (tree_t*) malloc(sizeof(tree_t));
    _bst->root = NULL;
    return _bst;
}

node_t* 
get_min_val(node_t* node) {
    node_t* min = NULL;
    for(node_t* aux = node; aux != NULL; aux = aux->left) {
        min = aux;
    }
    return min;
}

node_t* 
__insert_recursive(node_t* root, int data) {
    if(root == NULL) {
        return Node(data);
    } else {
        if(data >= root->data) {
            root->right = __insert_recursive(root->right, data);
        } else {
            root->left = __insert_recursive(root->left, data);
        }
        return root;
    }
}

node_t*
__remove_largest(node_t* root) {
    if(root == NULL) {
        return NULL;
    } else if(root->right == NULL) {
        return root->left;
    } else {
        root->right = __remove_largest(root->right);
        return root;
    }
}

node_t*
__remove_smallest(node_t* root) {
    if(root == NULL) {
        return NULL;
    } else if(root->left == NULL) {
        return root->right;
    } else {
        root->left = __remove_smallest(root->left);
        return root;
    }
}

node_t* 
__remove(node_t* root, int data) {
    if(root == NULL) {
        return NULL;
    }

    if(data >= root->data) {
        root->right = __remove(root->right, data);
    } else {
        root->left = __remove(root->left, data);
    }

    if(root->data == data) {
        // Has no children
        if(root->right == NULL && root->left == NULL) {
            return NULL;
        } 
        // Has both children
        else if(root->right != NULL && root->left != NULL) {
            node_t* aux = get_min_val(root->right);
            __remove(root, root->data);
            root->data = aux->data;
        } else if(root->left == NULL) {
            return root->right;
        } else if(root->right == NULL) {
            return root->left;
        }
        return root;
    }
}

int 
__height(node_t* root) {
    if(root == NULL) {
        return -1;
    } else {
        int left = __height(root->left);
        int right = __height(root->right);

        if(left > right) {
            return left + 1;
        }
        return right + 1;
    }
}

int 
height(tree_t* tree) {
    return __height(tree->root);
}

node_t*
remove_largest(tree_t* tree) {
    node_t* aux = __remove_largest(tree->root);
    printf("Removed largest: %d\n", aux->data);
    return aux;
}

node_t*
remove_smallest(tree_t* tree) {
    node_t* aux = __remove_smallest(tree->root);
    printf("Removed smalled: %d\n", aux->data);
    return aux;
}

void 
insert(tree_t* tree, int data) {
    tree->root = __insert_recursive(tree->root, data);
}

void 
__pre_order(tree_t* tree, node_t* node) {
    if(node != NULL) {
        printf("Value: %d\n", node->data);
        __pre_order(tree, node->left);
        __pre_order(tree, node->right);
    }
}

void 
__post_order(tree_t* tree, node_t* node) {
    if(node != NULL) {
        __post_order(tree, node->left);
        __post_order(tree, node->right);
        printf("Value: %d\n", node->data);
    }
}

void 
__in_order(tree_t* tree, node_t* node) {
    if(node != NULL) {
        __in_order(tree, node->left);
        printf("Value: %d\n", node->data);
        __in_order(tree, node->right);
    }
}

void 
pre_order(tree_t* tree) {
    printf("PRE-ORDER\n");
    __pre_order(tree, tree->root);
}

void 
post_order(tree_t* tree) {
    printf("POST-ORDER\n");
    __post_order(tree, tree->root);
}

void 
in_order(tree_t* tree) {
    printf("IN-ORDER\n");
    __in_order(tree, tree->root);
}

bool 
is_empty(tree_t* tree) {
    if (tree->root == NULL) 
        return true;
    return false;
}