package com.p1t1.SOLID;

import java.util.List;

public class DependencyInversion {
    public static void main(String[] args) {
        IRelationAdder friend = new RelationShipFamily();
        
        Person duc = new Person();
        duc.name = "Đức";
        duc.relationship = Relationship.Parent;
        
        Person hoang = new Person();
        hoang.name = "Hoàng";
        hoang.relationship = Relationship.Child;

        friend.AddParentAndChildren(duc, hoang);

        Explorer exp = new Explorer();
        exp.findRelationParent(friend);
    }

    public enum Relationship {
        Parent, Child, Sibling
    }

    public interface IAdder {
        void AddParentAndChildren(Person parent, Person child);
    }

    public interface IRelationShip {
        List<Person> FindAllChildOf(String name);
    }

    public interface IRelationAdder extends IAdder, IRelationShip {

    }

    public static class Person {
        private String name;
        private Relationship relationship;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Relationship getRelationship() {
            return relationship;
        }

        public void setRelationship(Relationship relationship) {
            this.relationship = relationship;
        }
    }

    public static class RelationShipFamily implements IRelationAdder {

        @Override
        public void AddParentAndChildren(Person parent, Person child) {

        }

        @Override
        public List<Person> FindAllChildOf(String name) {
            return null;
        }
    }

    public static class Explorer {
        public void findRelationParent(IRelationShip relationshipfamily) {
            for (Person p : relationshipfamily.FindAllChildOf("Đức")) {
                System.out.println("Đức có người bạn tên là " + p.name);
            }
        }
    }
}