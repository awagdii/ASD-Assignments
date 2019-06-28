package day04.simple.association;

import association.framework.*;
import org.junit.Test;

import java.util.Date;


public class CollectionOfOneTest {
    Authorization authorization = new Authorization(new Date().toString(), 1);
    Person person = new Person("Ahmed", "1");
    Account account = new Account(100, "Finance");

    AssociationClass associationClass = new AssociationClass("Is Autorized To Access", "Can be accessed by ",
            Association.Multiplicity.ZeroOrMore, Association.Multiplicity.ZeroOrMore, "Manger", "Asset", "Manger Account Association");

    @Test
    public final void testGetMultiplicityName() {


        associationClass.link(authorization, person, account);

        System.out.println(person.getName() + "Has following privileges ");
        for (Object e : associationClass.fromLeft(person)) {

            Triplet triplet = (Triplet) e;

            Account acc = (Account) triplet.right;
            Authorization auth = (Authorization) triplet.linkObject;

            System.out.println(" Account " + acc.description() + " According to " + auth.description());

        }

    }

    @Test
    public final void testLink() {
        associationClass.link(authorization, person, account);
    }

    @Test
    public final void testIsLinked() {

        CollectionOfMany collectionOfMany = new CollectionOfMany();
        collectionOfMany.link(person, account);

        System.out.println(collectionOfMany.isLinked(person, account));
        System.out.println(collectionOfMany.isLinked(person, new Account(9, "HR")));
    }

    @Test
    public final void testUnlink() {
        associationClass.link(authorization, person, account);
        associationClass.unlink(associationClass.fromLeft(person));
    }

    @Test
    public final void testUnlinkFrom() {
        CollectionOfMany collectionOfMany = new CollectionOfMany();
        collectionOfMany.link(person, account);
        collectionOfMany.unlink(person, account);

        System.out.println(collectionOfMany.isLinked(person, account));
    }

    @Test
    public final void testIsLinkedTo() {
        CollectionOfOne collectionOfOne = new CollectionOfOne();
        collectionOfOne.link(person, account);

        System.out.println(collectionOfOne.isLinkedTo(person));
    }

    @Test
    public final void testMultiplicities() {
        CollectionOfMany collectionOfMany = new CollectionOfMany();
        collectionOfMany.link(person, account);

        System.out.println(collectionOfMany.isLinked(person, account));    }

}
