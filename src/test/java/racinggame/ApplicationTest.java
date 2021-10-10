package racinggame;

import nextstep.test.NSTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ApplicationTest extends NSTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    private static final String ERROR_MESSAGE = "[ERROR]";

    @BeforeEach
    void beforeEach() {
        setUp();
    }

    @Test
    void 전진_정지() {
        assertRandomTest(() -> {
            run("pobi,woni", "1");
            verify("pobi : -", "woni : ", "최종 우승자는 pobi 입니다.");
        }, MOVING_FORWARD, STOP);
    }

    @Test
    void 전진_정지_여러_라운드() {
        assertRandomTest(() -> {
                run("pobi,woni,youn", "3");
                verify("pobi : -", "woni : ", "youn : ---", "최종 우승자는 youn 입니다.");
            },
            MOVING_FORWARD, STOP, MOVING_FORWARD,
            STOP, STOP, MOVING_FORWARD,
            STOP, STOP, MOVING_FORWARD);
    }

    @Test
    void 우승자_여러명() {
        assertRandomTest(() -> {
                run("pobi,woni,youn", "3");
                verify("pobi : --", "woni : ", "youn : --", "최종 우승자는 pobi,youn 입니다.");
            },
            MOVING_FORWARD, STOP, MOVING_FORWARD,
            MOVING_FORWARD, STOP, STOP,
            STOP, STOP, MOVING_FORWARD);
    }

    @Test
    void 이름에_대한_예외_처리() {
        assertSimpleTest(() -> {
            runNoLineFound("pobi,javaji");
            verify(ERROR_MESSAGE);
        });
    }

    @Test
    void 라운드수에_대한_예외_처리() {
        assertSimpleTest(() -> {
            runNoLineFound("pobi,youn", "a");
            verify(ERROR_MESSAGE);
        });
    }

    @AfterEach
    void tearDown() {
        outputStandard();
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
