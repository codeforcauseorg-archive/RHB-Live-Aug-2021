import ButtonAppBar from "../components/ButtonAppBar";

export default function BaseLayout({ children }) {
  return (
    <div>
      <ButtonAppBar />
      {children}
    </div>
  );
}
