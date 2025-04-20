package org.example.behavioralpatterns.visitor;

interface NannyVisitor {
    void visit(Baby baby);
    void visit(Preschooler preschooler);
    void visit(Schoolchild schoolchild);
}
