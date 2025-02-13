package com.hyosung.tnsplm.migrator;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.hyosung.tnsplm.migrator.part.service.PartMigratorHelper;

/**
 * @클래스명 : SapPartTransferWindchill.java
 * @최초 작성자 :
 * @최초 작성일 : 2025. 02. 06
 * @설명 :
 */
public class SapPartTransferWindchill {

	/**
	 * @메소드명 :
	 * @최초 작성자 :
	 * @최초 작성일 : 2025. 02. 06
	 * @설명 :
	 */
	public static void main(String[] args) throws Exception {
		// 날짜 및 시간 형식 지정
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		// 시작 시간 표시
		LocalDateTime startTime = LocalDateTime.now();
		System.out.println("작업 시작 시간 : " + startTime.format(formatter));

		try {
			// 부품 생성 함수 실행
			if (args.length > 0) {
				System.out.println("엑셀 파일 경로: " + args[0]);
				PartMigratorHelper.service.readExcelSapTransferWindchillPart(args[0]);
			} else {
				System.out.println("엑셀 파일 경로가 제공되지 않았습니다.");
			}
		} catch (Exception e) {
			// 예외 발생 시 출력
			System.err.println("오류 발생: " + e.getMessage());
			e.printStackTrace();
		}

		// 종료 시간 표시
		LocalDateTime endTime = LocalDateTime.now();
		System.out.println("작업 종료 시간 : " + endTime.format(formatter));

		// 실행 시간 계산
		long elapsedSeconds = Duration.between(startTime, endTime).getSeconds();
		System.out.println("총 실행 시간 : " + elapsedSeconds + "초");

		System.exit(0);
	}
}
