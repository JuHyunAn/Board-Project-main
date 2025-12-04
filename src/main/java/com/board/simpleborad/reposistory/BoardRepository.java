package com.board.simpleborad.reposistory;

import com.board.simpleborad.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {   // model참조
    
    // 논리삭제 여부로 조회
    List<Board> findByDelYn(String delYn);  // findBy + 컬럼명(첫글자 대문자): delYn 값을 기준으로 알아서 조회
}
