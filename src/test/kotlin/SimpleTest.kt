import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.test.runTest
import kotlin.test.Test

@OptIn(ExperimentalCoroutinesApi::class)
class TestClient {

    @Test
    fun testGreet() = runTest {
        val flow = MutableStateFlow(true)
        flow.collect()
    }

}
