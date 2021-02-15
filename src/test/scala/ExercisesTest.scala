import exercise0.Persona
import exercise1.Impiegato
import org.scalatest._
import flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ExercisesTest extends AnyFlatSpec with Matchers {


  "Persona" should "print details" in {

    val p= new Persona("Gigi", "cognome", 33)

    p.dettagli().contains("33") shouldBe true
    p.dettagli().contains("cognome") shouldBe true
    p.dettagli().contains("Gigi") shouldBe true

  }

  "Impiegato" should "earn lots of money" in {

    val i = new Impiegato("Gigi", "cognome", 1300.0)

    i.dettagli().contains("Gigi") shouldBe true
    i.dettagli().contains("cognome") shouldBe true
    i.dettagli().contains("1300") shouldBe true

    i.aumentaSalario(10)
    i.dettagli().contains("1300") shouldBe false
    i.dettagli().contains("1430") shouldBe true

  }

}
