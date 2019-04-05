import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.assertEquals;

public class VectorHeapTest<E> {
    @Test
    public void sizeTest() {
        VectorHeap myVectorHeap = new VectorHeap();
        int expectedResult = 0;
        int result = myVectorHeap.size();
        assertEquals(expectedResult, result);
    }

    @Test
    public void isEmptyTest(){
        VectorHeap myVectorHeap = new VectorHeap();
        boolean expectedResult = true;
        boolean result = myVectorHeap.isEmpty();
        assertEquals(expectedResult, result);
    }

    @Test
    public void getFirstTest(){
        VectorHeap myVectorHeap = new VectorHeap();
        Paciente Luca = new Paciente("Luca", "Sueño", "A");
        myVectorHeap.add(Luca);
        Paciente expectedResult = Luca;
        assertEquals(expectedResult, myVectorHeap.getFirst());
    }

    @Test
    public void removeTest(){
        VectorHeap myVectorHeap = new VectorHeap();
        Paciente Luca = new Paciente("Luca", "Sueño", "A");
        Paciente Willi = new Paciente("Willi", "Hueva", "E");
        myVectorHeap.add(Luca);
        myVectorHeap.add(Willi);
        Paciente expectedResult = Luca;
        assertEquals(expectedResult, myVectorHeap.remove());
    }

}
