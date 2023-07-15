# AWS CI/CD
  1. EC2 인스턴스 생성
     - 설정 및 생성
     - 보안 그룹 등록(22,443,8080,80 + local ip)
     - 탄력적 ip 설정
       - 작업 > 보안 그룹설정
     - IAM 역할 설정
       - AmazonS3FullAccess, AWSCodeDeployFullAccess
     - TAG 생성 (CODEDEPLOY 배포 그룹 등록 필요)
  2. S3 버킷 생성
     - AWS 리전 설정
     - S3 IAM 사용자 생성
       - AmazonS3FullAccess, AWSCodeDeployFullAccess
       - github action에 액세스 키 등록
  3. CODEDEPLOY
     - 애플리케이션 생성
       - 컴퓨팅 플랫폼 온프레미스
     - 배포 그룹 생성
       - 환경구성 Amazon EC2 인스턴스
         - EC2 TAG 등록
       - 서비스 역할 입력(IAM)
         - AWSCodeDeployRole
     - appspec.yml 설정 파일 생성(codedeploy 실행 파일)
       - scripts에 배포 셀 파일 생성 

  4. EC2 프로그램 설치
     - aws corretto 다운
     - java 설치
     - ruby, codedeploy

  5. github action 빌드 설정 파일 생성
     - ./workflows/deploy.yml
  
